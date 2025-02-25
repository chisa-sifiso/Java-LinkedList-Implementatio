<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
</head>
<body>

  <h1>Linked List Implementation in Java</h1>
    <p>This project is a simple implementation of a singly linked list in Java.</p>

  <h2>Features</h2>
    <ul>
        <li>Add elements to the beginning or end of the list.</li>
        <li>Remove elements from the beginning or end.</li>
        <li>Display all elements in the linked list.</li>
    </ul>
    <h2>Project Structure</h2>
    <pre>
    /LinkedList-Java
    ├── src/
    │   ├── LinkedListOfStrings.java
    │   ├── Main.java (for testing)
    ├── README.html
    ├── .gitignore
    └── LICENSE
    </pre>
    <h2>Usage</h2>
    <p>To use this linked list, create an instance of <code>LinkedListOfStrings</code> and call the methods.</p>
    <pre>
    LinkedListOfStrings list = new LinkedListOfStrings();
    list.addBeginning("Hello");
    list.addEnd("World");
    list.display(); // Output: Hello -> World -> End
    </pre>
    <h2>License</h2>
    <p>This project is licensed under the MIT License.</p>

</body>
</html>
