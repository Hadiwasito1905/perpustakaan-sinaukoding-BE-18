package sinaukodingBE18.perpustakaan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sinaukodingBE18.perpustakaan.dao.BaseDAO;
import sinaukodingBE18.perpustakaan.dao.BookDAO;
import sinaukodingBE18.perpustakaan.entity.Book;

@Service
public class BookService extends BaseService<Book> {
    @Autowired
    private BookDAO dao;

    @Override
    protected BaseDAO<Book> getDAO() {
        return dao;
    }
}
