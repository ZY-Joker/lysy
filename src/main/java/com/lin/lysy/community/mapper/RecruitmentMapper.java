package com.lin.lysy.community.mapper;

import com.lin.lysy.community.entity.Recruitment;
import com.lin.lysy.learn.entity.Article;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface RecruitmentMapper {
    public void addRecruitment(@Param("recruitment") Recruitment recruitment);
    @Select("select count(*) from Recruitment where Com_Id=#{Com_Id}")
    public int getNumber(@Param("Com_Id") String Com_Id);
    @Select("select * from Recruitment where Recru_Id=#{Recru_Id}")
    public Recruitment findOne(@Param("Recru_Id") String Recru_Id);
    @Update("update Recruitment set Recru_number=#{Recru_number} where Recru_Id=#{Recru_Id}")
    public void RecruSumit(@Param("Recru_Id") String Recru_Id,@Param("Recru_number") int Recru_number);
    @Delete("delete * from Recruitment where Recru_Id=#{Recru_Id}")
    public void Delete(@Param("Recru_Id") String Recru_Id);


    @Select("select * from Recruitment where Com_Id=#{Com_Id}")
    List<Recruitment> queryByComId(@Param("Com_Id") String Com_Id);
}
