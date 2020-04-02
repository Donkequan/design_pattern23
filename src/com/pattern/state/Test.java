package com.pattern.state;

public class Test
{
    public static void main(String[] args)
    {
        Context account=new Context();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}
