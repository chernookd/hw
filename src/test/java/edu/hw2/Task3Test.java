package edu.hw2;

import edu.hw2.task3.ConnectionException;
import edu.hw2.task3.DefaultConnectionManager;
import edu.hw2.task3.FaultyConnection;
import edu.hw2.task3.FaultyConnectionManager;
import edu.hw2.task3.FrequencyConnectionException;
import edu.hw2.task3.FrequencyOfFaultyConnection;
import edu.hw2.task3.PopularCommandExecutor;
import edu.hw2.task3.StableConnection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task3Test {
    @ParameterizedTest
    @EnumSource(FrequencyOfFaultyConnection.class)
    void DefaultConnectionManagerTest(FrequencyOfFaultyConnection frequencyOfFaultyConnection)
    {
        DefaultConnectionManager defaultConnectionManager = new DefaultConnectionManager();
        defaultConnectionManager.setFrequencyOfFaultyConnection(frequencyOfFaultyConnection);
        switch (frequencyOfFaultyConnection) {
            case ALWAYS :
                assertThat(defaultConnectionManager.getConnection().getClass().getName())
                    .isEqualTo(FaultyConnection.class.getName());
                break;
            case NEWER:
                assertThat(defaultConnectionManager.getConnection().getClass().getName())
                    .isEqualTo(StableConnection.class.getName());
                break;
            case RANDOM:
                assertThat(defaultConnectionManager.getConnection()).isNotNull();
        }

    }
    @Test
    void FaultyConnectionManagerTest()
    {
        FaultyConnectionManager faultyConnectionManager = new FaultyConnectionManager();
        assertThat(faultyConnectionManager.getConnection()).isNotNull();
        assertThat(faultyConnectionManager.getConnection().getClass().getName())
            .isEqualTo(FaultyConnection.class.getName());

    }

    @ParameterizedTest
    @EnumSource(FrequencyConnectionException.class)
    void FaultyConnectionTest(FrequencyConnectionException frequencyConnectionException)
    {
        FaultyConnection faultyConnection = new FaultyConnection();
        faultyConnection.setFrequencyConnectionException(frequencyConnectionException);
        switch (frequencyConnectionException) {
            case ALWAYS :
                assertThrows(ConnectionException.class, () -> {
                    faultyConnection.execute("command");
                    throw new ConnectionException();
                });

                break;
            case NEWER:
                assertDoesNotThrow(() -> faultyConnection.execute("command"));
                break;
            case RANDOM:
        }
        faultyConnection.close();

    }

    @Test
    void PopularCommandExecutorWithDefaultConnectManagerTest()
    {
        DefaultConnectionManager defaultConnectionManager = new DefaultConnectionManager();
        defaultConnectionManager.setFrequencyOfFaultyConnection(FrequencyOfFaultyConnection.NEWER);
        PopularCommandExecutor popularCommandExecutor =
            new PopularCommandExecutor(defaultConnectionManager, 5);
        assertDoesNotThrow(popularCommandExecutor::updatePackages);

        defaultConnectionManager.setFrequencyOfFaultyConnection(FrequencyOfFaultyConnection.ALWAYS);
        PopularCommandExecutor popularCommandExecutor1 =
            new PopularCommandExecutor(defaultConnectionManager, 5);
        assertThrows(ConnectionException.class, popularCommandExecutor1::updatePackages);
    }

    @Test
    void PopularCommandExecutorWithFaultyConnectManagerTest()
    {
        FaultyConnectionManager faultyConnectionManager = new FaultyConnectionManager();
        PopularCommandExecutor popularCommandExecutor =
            new PopularCommandExecutor(faultyConnectionManager, 5);
        assertThrows(ConnectionException.class, popularCommandExecutor::updatePackages);
    }
}
