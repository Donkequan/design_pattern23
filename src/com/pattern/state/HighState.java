package com.pattern.state;

class HighState extends AbstractState {

    public HighState(AbstractState state) {
        super.hj = state.hj;
        super.stateName = "优秀";
        super.score = state.score;
    }

    public void checkState() {
        if(score<60) {
            hj.setState(new LowState(this));
        } else if(score<90) {
            hj.setState(new MiddleState(this));
        }
    }
}
