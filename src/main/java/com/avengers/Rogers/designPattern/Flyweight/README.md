# Flyweight Pattern

## Introduce

Flyweight use sharing to support a large number of objects that have part of their internal state in common where the other part of state can vary.

## In JDK

* java.lang.Integer#valueOf(int) (also on Boolean, Byte, Character, Short, Long, Float and Double)
* Java String creation. (Read about string creation in Java specification)

# Demo

```java
public class ConnectionPool {

    Connection conn = null;

    private static ConnectionPool instance = null;
    private Vector<Connection> pool;

    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";
    private int poolSize = 100;

    private ConnectionPool() {
        pool = new Vector<Connection>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /* back to pool */
    public synchronized void release() {
        pool.add(conn);
    }

    /* return a connection */
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }
}
```