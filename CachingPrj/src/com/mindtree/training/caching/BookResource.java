package com.mindtree.training.caching;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;



@Path("/book")
@Singleton
public class BookResource {
	private Map<Integer, Book> books=new HashMap<Integer, Book>();
	
	public BookResource()
	{
		
		books.put(1001, new Book(1001, "My Experiments with Truth", "Gandhiji", 400,new Date()));
		books.put(1002, new Book(1002, "Wings of Fire", "Abdul Kalam", 300,new Date()));
		books.put(1003, new Book(1003, "Discover India", "Jawaharlal Nehru", 450,new Date()));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{isbn}")
	public Response findBook(@PathParam("isbn") int isbn,@Context Request request)
	{
	Book book=books.get(isbn);
	CacheControl cacheControl=new CacheControl();
	cacheControl.setMaxAge(120);//2 minutes
	EntityTag eTag=new EntityTag(book.getLastModified().toString());
	ResponseBuilder builder=request.evaluatePreconditions(eTag);//compares If-None-Match with ETag available in server, returns null if they are not matching
	
	if(builder!=null){
		return builder.cacheControl(cacheControl).build();
	}
	
	return Response.status(200).entity(book).cacheControl(cacheControl).tag(eTag).build();
	}

	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{isbn}/price/{price}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateBook(@PathParam("isbn")int isbn,@PathParam("price")double price)
	{
			Book book=books.get(isbn);
			book.setPrice(price);
			book.setLastModified(new Date());
			return "book with isbn "+isbn+" successfully updated";
	}
	
}
