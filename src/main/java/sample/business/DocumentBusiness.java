package sample.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import sample.dao.DocumentDAO;
import sample.entities.Document;

@Stateless
public class DocumentBusiness {

	@Inject
	private DocumentDAO dao;

	public List<Document> all() {
		return dao.findAll();
	}

}
