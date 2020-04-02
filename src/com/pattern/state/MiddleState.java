package com.pattern.state;

class MiddleState extends AbstractState {

    public MiddleState(AbstractState state) {
        hj=state.hj;
        stateName="中等";
        score=state.score;
    }

    public void checkState() {
        if(score<60) {
            hj.setState(new LowState(this));
        } else if(score>=90) {
            hj.setState(new HighState(this));
        }
    }
}
