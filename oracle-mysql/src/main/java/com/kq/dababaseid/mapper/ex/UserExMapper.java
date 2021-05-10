package com.kq.dababaseid.mapper.ex;

/**
 * @author kq
 * @date 2021-05-10 10:38
 * @since 2020-0630
 */
public interface UserExMapper {

    /**
     * 获取用户帐号
     * @param userId
     * @return
     */
    public String getAccount(String userId);


    /**
     * 获取用户帐号 根据databaseId来选择
     * @param userId
     * @return
     */
    public String getAccountByDataBase(String userId);


}
