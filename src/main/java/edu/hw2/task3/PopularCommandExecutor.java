package edu.hw2.task3;

public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        this.manager = manager;
        this.maxAttempts = maxAttempts;
    }


    public void updatePackages() {
        tryExecute();
    }

    private void tryExecute() {
        int attempts = 0;
        boolean successfulExecution = false;
        while (attempts < maxAttempts && !successfulExecution) {
            try (Connection connection = this.manager.getConnection()) {
                connection.execute("apt update && apt upgrade -y");
                successfulExecution = true;
            } catch (ConnectionException e) {
                attempts++;
            } catch (Exception e) {
               break;
            }
        }
        if (!successfulExecution) {
            throw new ConnectionException();
        }
    }
}
