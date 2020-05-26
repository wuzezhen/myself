package com.ze;

/**
 * @author kz
 * @create 2020-05-25 15:17
 * @exception
 */
public class ZeService {

    private ZeProperties zeProperties;

    public ZeService() {
    }

    public ZeService(ZeProperties zeProperties) {
        this.zeProperties = zeProperties;
    }

    public void sayHello(){

        System.out.println("名字:"+zeProperties.getName()+"年龄:"+zeProperties.getAge()+"性别:"+zeProperties.getSex());
    }
}
