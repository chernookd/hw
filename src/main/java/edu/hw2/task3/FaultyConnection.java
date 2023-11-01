package edu.hw2.task3;

public class FaultyConnection implements Connection {

    private FrequencyConnectionException frequencyConnectionException = FrequencyConnectionException.ALWAYS;

    public void setFrequencyConnectionException(FrequencyConnectionException frequencyConnectionException) {
        this.frequencyConnectionException = frequencyConnectionException;
    }

    @Override
    public void execute(String command) {
        final int randomizerVariable = 5;
        final int theUpperLimitOfSetRandomNumbers = 10;
        switch (this.frequencyConnectionException) {
            case RANDOM:
                int rand = (int) (Math.random() * theUpperLimitOfSetRandomNumbers);
                if (rand < randomizerVariable) {
                    throw new ConnectionException();
                }
                break;
            case ALWAYS:
                throw new ConnectionException();
            default:
        }
    }

    @Override
    public void close() {

    }
}
