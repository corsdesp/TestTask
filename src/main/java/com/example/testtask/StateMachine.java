package com.example.testtask;

public class StateMachine {
    private One one = new One();
    private Zero zero = new Zero();
    private StateType stateType;

    public StateType getStateType() {
        return stateType;
    }

    public void event() {
        InputConsole inputConsole = new InputConsole();
        inputConsole.read();

        char[] ch = inputConsole.getChars();
        for (char _ch : ch)
            switch (_ch) {
                case '0': {
                    zero.plusPlus();
                    stateType = StateType.ZERO;
                    break;
                }
                case '1': {
                    one.plusPlus();
                    stateType = StateType.ONE;
                    break;
                }
            }

        OutputConsole outputConsole = new OutputConsole();
        if (stateType != null) {
            outputConsole.print(yesOrNo());
        }
    }

    public boolean yesOrNo() {
        return !one.isEvenNumber() && zero.isEvenNumber();
    }
}
