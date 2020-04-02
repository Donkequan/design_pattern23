package com.pattern.state;

class Context {

    private AbstractState state;

    Context() {
        state=new LowState(this);
    }

    public void setState(AbstractState state) {
        this.state=state;
    }

    public AbstractState getState() {
        return state;
    }

    public void add(int score) {
        state.addScore(score);
    }
}