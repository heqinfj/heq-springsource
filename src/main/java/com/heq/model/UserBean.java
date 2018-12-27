package com.heq.model;

/**
 * @Auther: heq
 * @Date: 2018/12/17
 * @Description:
 */
public class UserBean {

    private String userName;

    private AddressBean addressBean;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AddressBean getAddressBean() {
        return addressBean;
    }

    public void setAddressBean(AddressBean addressBean) {
        this.addressBean = addressBean;
    }
}
