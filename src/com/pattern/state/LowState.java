package com.pattern.state;

class LowState extends AbstractState
{
    public LowState(Context h) {
        hj=h;
        stateName="不及格";
        score=0;
    }

    public LowState(AbstractState state) {
        hj=state.hj;
        stateName="不及格";
        score=state.score;
    }

    public void checkState() {
        if(score>=90)
        {
            hj.setState(new HighState(this));
        }
        else if(score>=60)
        {
            hj.setState(new MiddleState(this));
        }
    }
}
