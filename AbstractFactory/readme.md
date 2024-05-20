- consider the racing game scenario,
- In abstract factory layer, you provide "snow" and every object should be created in snow condition, road will have snow on it, mountain will have snow on it.
- similarly if you provide "rain" then every object like road, mountain, car will have water on it, road will have puddle in it.
- with abstract factory all the objects will get created in a similar condition. we need not create them separately by providing the "snow", "rain" string.
- with abstract factory we have abstraction over factory and the objects created are consistant.


### Better example
- abstract factory has 2 factory implemented - RedFactory, BlueFactory
- Both the factory produces shapes of Rectangle, Square, Circle
- But RedFactory produces all the shapes in RED, whereas BlueFactory produces the shapes in Blue ink