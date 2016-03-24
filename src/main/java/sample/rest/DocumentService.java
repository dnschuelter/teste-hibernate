package sample.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sample.business.DocumentBusiness;
import sample.entities.Document;

@Path("/document")
public class DocumentService {

	@Inject
	private DocumentBusiness business;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<Document> list() {
		return business.all();
	}
}
