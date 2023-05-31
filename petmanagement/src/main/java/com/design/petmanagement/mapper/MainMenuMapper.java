package com.design.petmanagement.mapper;

import com.design.petmanagement.pojo.MainMenu;
import java.util.List;

import com.design.petmanagement.pojo.Submenu;
import org.apache.ibatis.annotations.Param;
/**
 * (MainMenu)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-02 09:06:34
 */
public interface MainMenuMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MainMenu queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询条件
     * @param limit   查询条数
     * @return 对象列表
     */
    List<MainMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 统计总行数
     *
     * @param mainMenu 查询条件
     * @return 总行数
     */
    long count(MainMenu mainMenu);

    /**
     * 新增数据
     *
     * @param mainMenu 实例对象
     * @return 影响行数
     */
    int insert(MainMenu mainMenu);


    /**
     * 修改数据
     *
     * @param mainMenu 实例对象
     * @return 影响行数
     */
    int update(MainMenu mainMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


    void addMenu(MainMenu mainMenu);

    void updateMainMenu(MainMenu mainMenu);


    List<MainMenu> getMenuTree(String type);
}

