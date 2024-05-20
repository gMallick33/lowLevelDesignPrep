- Sometimes object creation is expensive. Reason could be the class has a lot of member variable inside it. Or some other reason.
- So to create a new object and then copy the member variables value into a newly created object could take more time.
- So instead we can use prototype pattern and clone the object.
- Also in the earlier way, we need to have all the idea about the original objects and its member variable to copy the values to the new object.
- But with prototype we don't need to have those ideas.