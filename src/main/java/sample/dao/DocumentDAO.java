package sample.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.querydsl.jpa.impl.JPAQueryFactory;

import sample.entities.Document;
import sample.entities.QDocument;

@Stateless
public class DocumentDAO {

	@PersistenceContext(unitName = "sample-jpa")
	protected EntityManager entityManager;

	public List<Document> findAll() {
		JPAQueryFactory query = new JPAQueryFactory(entityManager);
		return query.selectFrom(QDocument.document).fetch();
	}

}
