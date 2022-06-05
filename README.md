It happens again and again that we humans need to quickly check whether two long numbers are the same. Since we struggle with this, we can try to generate a picture from the numbers. We can then check their equality much faster and in a more reliable way. For more information, interested readers can also look up the term "Randomart", but this is not part of the task here.

Surprisingly, penguins are also faced with this problem, and now want to solve it in a similar way - with the implementation of "Pingu-Art".

Program Statement
Your program should make it possible to visualize numbers entered by the user penguin as pingu art.

In the first step, eight numbers should be entered via the console. If all numbers have been successfully read in and temporarily stored, they will be displayed as Pingu Art on the console.

Each of the eight numbers that the user penguin enters is a maximum of eight digits long and consists only of the digits 0, 1, 2 and 3. The reason for the restriction to these digits is that penguins can only use three toes for counting (more about penguins). For numbers with fewer than eight digits, the "missing" front digits are implicitly 0 (e.g. the number 122 can also be seen as 00000122). The program behavior is not defined for inputs that do not correspond to this format.

The prompt should look like this:

Please enter a Pingu Art number:
After the user penguin has entered numbers eight times in this way, the Pingu-Art appears on the console. A Pingu-Art visualizes these numbers through a generated image that shows penguins swimming in the sea.

A Pingu-Art starts with the line

+---[PinguArt]---+
Then the lines for the content of the picture follow:

|<Number 1><Number 2>|
|<Number 3><Number 4>|
|<Number 5><Number 6>|
|<Number 7><Number 8>|
<Number i> stands for the number i converted into Pingu-Art. A number is converted as follows::

The digits 0, 1, 2 and 3 are converted " " (space), "-", "~" and "P" (penguin) respectively.
The number is processed from the last digit to the first digit.
For example, the number 12010302 is converted to "~ P - ~-", and the number 122 is converted to "~~-     ".

The Pingu-Art then ends with the line

+----------------+
Then the program ends.

Example
An running example looks like:

Please enter a Pingu Art number:
> 20200220
Please enter a Pingu Art number:
> 10121201
Please enter a Pingu Art number:
> 12
Please enter a Pingu Art number:
> 10302101
Please enter a Pingu Art number:
> 2303120
Please enter a Pingu Art number:
> 1231200
Please enter a Pingu Art number:
> 20201210
Please enter a Pingu Art number:
> 120012
+---[PinguArt]---+
| ~~  ~ ~- ~-~- -|
|~-      - -~ P -|
| ~-P P~   ~-P~- |
| -~- ~ ~~-  ~-  |
+----------------+
The lines that begin with "> " mark the user input of the program. They are only given for the sake of clarity.

 Test that the above example works 1 of 1 tests passing


Another example with a test:
The "213201", "0023201", "032120", "01010321", "20320101", "02120203", "2103201" und "021320" inputs are used for testing.

 Second example 1 of 1 tests passing


Hinweis: In the lecture it was mentioned that number constants with leading zeros in the Java source text are regarded as octal numbers. When reading in with MiniJava via readInt, integers with leading zeros are still treated as decimal numbers, as is intended here.
