package com.pattern.state;

abstract class AbstractState {

    protected Context hj;  //环境
    protected String stateName; //状态名
    protected int score; //分数

    public abstract void checkState(); //检查当前状态

    public void addScore(int scoreAdd) {
        this.score+=scoreAdd;
        System.out.print("加上："+scoreAdd+"分，\t当前分数："+this.score );
        checkState();
        System.out.println("分，\t当前状态："+hj.getState().stateName);
    }
}
