Total 5 ways to do singleton pattern
- Eager: initialize the DBConnection in the start
- Lazy: First check if null, and if null then only initialize
- Synchronized: the getConnection method is synchronized. But it is very expansive
- Double locking: check null. inside that synchronized(DB.class){if null}. But with cpu reordering and L1 caching problem is there
- Volatile: just do private static volatile DBConnection; It before the volatile object line the code can reorder but after code and before code of volatile can't reorder between themselves.
- Also every object created before the volatile object code should get dumped in the memory. so there is no caching problem.