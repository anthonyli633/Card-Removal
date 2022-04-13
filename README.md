Bessie the cow has two decks of ![](https://latex.codecogs.com/svg.image?N&space;(1&space;\leq&space;N&space;\leq&space;10^5)) double-sided cards, with the ![](https://latex.codecogs.com/svg.image?i)-th card in both decks having a front number of ![](https://latex.codecogs.com/svg.image?f_i) and a back number of ![](https://latex.codecogs.com/svg.image?b_i). The cards are numbered in a way such that ![](https://latex.codecogs.com/svg.image?f) and ![](https://latex.codecogs.com/svg.image?b) are both permutations of ![](https://latex.codecogs.com/svg.image?1,2,...,N). Bessie would like both of her decks to have the property that the front and back sides of her cards consist of the same set of numbers (empty set counts.) 

There are ![](https://latex.codecogs.com/svg.image?Q&space;(1&space;\leq&space;Q&space;\leq&space;10^5)) queries, with each query consisting of the integer ![](https://latex.codecogs.com/svg.image?r_i&space;(1&space;\leq&space;r_i&space;\leq&space;N)).

For each query, Bessie follows the following steps:
1. **Remove** the card with ![](https://latex.codecogs.com/svg.image?r_i) from the first deck if it exists in the first deck.
2. **Remove** the card with ![](https://latex.codecogs.com/svg.image?r_i) from the second deck if it exists in the second deck.
3. Output the minimum number of cards needed to be removed to preserve the property on the first deck. 
4. Output the number of ways to remove any number of cards from the second deck that it still satisfies the property. 
5. Reset the first deck to its original state 
6. **Remove** the minimum number cards from the second deck to preserve its property. 

Unfortunately, Bessie quickly becomes bored when doing this, so help Bessie by doing the steps for her. Because the values may be too large, output the remainders when both values are divided by ![](https://latex.codecogs.com/svg.image?10^9+7) for each query. 
<br></br>

**INPUT FORMAT (input arrives from the terminal / stdin):**

The first line contains ![](https://latex.codecogs.com/svg.image?N).

The second and third lines contain ![](https://latex.codecogs.com/svg.image?f) and ![](https://latex.codecogs.com/svg.image?b), respectively.

The fourth line contains ![](https://latex.codecogs.com/svg.image?Q).

The next ![](https://latex.codecogs.com/svg.image?Q) lines contains a query, with the ![](https://latex.codecogs.com/svg.image?i)-th line containing ![](https://latex.codecogs.com/svg.image?r_i).
<br></br>

**OUTPUT FORMAT (print output to the terminal / stdout):**

![](https://latex.codecogs.com/svg.image?Q) lines, with the ![](https://latex.codecogs.com/svg.image?i)-th line consisting of the two answers to each query, with each answer being separated by a space.)
<br></br>

**SAMPLE INPUT**
```
5
5 2 3 4 1
3 4 5 1 2
3
1
2
5
```

**SAMPLE OUTPUT**
```
2 2
2 1
1 1
```

After removing the last card from the first deck, he also needs to remove the second and fourth cards (2 in total). She can remove those three cards, or remove the all of them (2 ways). The first deck resets itself to its original state, but the second, fourth, and last cards are removed from the second deck.

Then, after the first deck gets reset and the second card is removed, he also needs to remove the fourth and fifth cards. Now, there is only one way to remove cards from the second deck such that it satisfies the property: remove all of them (1 way), and both decks are updated accordingly.

Problem Credits: Anthony Li
