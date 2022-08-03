package com.proves1.imatges.ModelTest;


import com.proves1.imatges.models.Comment;
import com.proves1.imatges.models.Moment;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MomentTest {
    private List <Comment> commentList = new ArrayList<>();
    private Moment moment = new Moment("Patata",2L,commentList,"patatesambsal.jpg","patates bonissimes");
    @Test
    void MomentHaveATitle() {

        var sut = moment.getTitle();

        assertEquals("Patata",sut);
    }
}
