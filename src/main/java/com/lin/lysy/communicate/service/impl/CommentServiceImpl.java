package com.lin.lysy.communicate.service.impl;

import com.lin.lysy.communicate.mapper.CommentMapper;
import com.lin.lysy.communicate.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;
    @Override
    public void addCom_content(String userId, String diaryId, String com_content, String date) {
        commentMapper.addCom_content(userId, diaryId, com_content, date);
    }
}
