package com.muatik.testappforjenkins;

import com.muatik.testappforjenkins.service.BookService;
import com.muatik.testappforjenkins.service.BookServiceBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BookServiceTests {

    @Test
    public void costCalculatedCorrectly() {
        BookService bookService = new BookServiceBean();
        Assert.assertEquals(22, bookService.calculateCost(100), 0.001);
    }
}
