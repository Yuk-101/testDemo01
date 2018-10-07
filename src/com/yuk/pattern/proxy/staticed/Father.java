package com.yuk.pattern.proxy.staticed;

/**
 * Created by yuk on 2018/10/4.
 */
public class Father {

    //目标对象
    private Person person;
    public Father(Person person){
        this.person = person;
    }

    //父亲肯定不能找对象，是帮你找，所以目标对象的引用给拿到
    public void findLove(){
        System.out.println("根据你的要求物色");
        this.person.findLove();
        System.out.println("双方父母是否同意");
    }
}
