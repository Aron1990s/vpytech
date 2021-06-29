package com.aron.vpythontech.service.baseService;

import java.util.List;

/**
 * @ClassName BaseService
 * @Description TODO
 * @Author aron
 * @Date 2020/9/8 10:04
 **/
public interface BaseService<E> {

    List<E> listInfo(E e);
    int saveInfo(E e);
    int editInfo(E e);
    E findById(E e);
    int delInfo(E e);

}
