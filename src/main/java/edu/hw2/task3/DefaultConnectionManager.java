package edu.hw2.task3;

public class DefaultConnectionManager implements ConnectionManager {

    private FrequencyOfFaultyConnection frequencyOfFaultyConnection;

    public void setFrequencyOfFaultyConnection(FrequencyOfFaultyConnection frequencyOfFaultyConnection) {
        this.frequencyOfFaultyConnection = frequencyOfFaultyConnection;
    }

    @Override
    public Connection getConnection() {

        final int randomizerVariable = 5;
        final int theUpperLimitOfSetRandomNumbers = 10;
        switch (this.frequencyOfFaultyConnection) {
            case RANDOM:
                int rand = (int) (Math.random() * theUpperLimitOfSetRandomNumbers);
                if (rand < randomizerVariable) {
                    return new FaultyConnection();
                } else {
                    return new StableConnection();
                }
            case NEWER:
                return new StableConnection();
            default:
                return new FaultyConnection();
        }

    }

}
