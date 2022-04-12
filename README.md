Bessie the cow has two decks of ![](https://latex.codecogs.com/svg.image?N&space;(1&space;\leq&space;N&space;\leq&space;10^5)) double-sided cards, with the ![](https://latex.codecogs.com/svg.image?i)-th card in both decks having a front number of ![](https://latex.codecogs.com/svg.image?f_i) and a back number of ![](https://latex.codecogs.com/svg.image?b_i). The cards are numbered in a way such that ![](https://latex.codecogs.com/svg.image?f) and ![](https://latex.codecogs.com/svg.image?b) are both permutations of ![](https://latex.codecogs.com/svg.image?1,2,...,N). Bessie would like both of her decks to have the property that the front and back sides of her cards consist of the same set of numbers. 

Given ![](https://latex.codecogs.com/svg.image?Q) queries, with each query consisting of the integer ![](https://latex.codecogs.com/svg.image?r_i&space;(1&space;\leq&space;r_i&space;\leq&space;N)), find two integers, ![](https://latex.codecogs.com/svg.image?x_i) and ![](https://latex.codecogs.com/svg.image?y_i) for the ![](https://latex.codecogs.com/svg.image?i)-th query. 

For each query, Bessie **removes** the card with ![](https://latex.codecogs.com/svg.image?r_i) on the front from both decks (only remove from a deck if it contains that card). Then, she finds ![](https://latex.codecogs.com/svg.image?x_i), the minimum number of cards needed to be removed to preserve the property on the first deck **(without actually removing them.)** Then, she finds ![](https://latex.codecogs.com/svg.image?y_i), the number of ways to remove any number of cards from the second deck that still satisfies the property **(without actually removing them.)** Finally, she only resets the first deck and **removes** the minimum number cards from the second deck to preserve the property unless it already follows the property.

Because the value of ![](https://latex.codecogs.com/svg.image?y_i) might be too large, find the remainder of ![](https://latex.codecogs.com/svg.image?y_i) when divided by ![](https://latex.codecogs.com/svg.image?10^9+7). Also note that removing all the cards counts and can contribute into ![](https://latex.codecogs.com/svg.image?y_i).
<br></br>

**INPUT FORMAT (input arrives from the terminal / stdin):**

The first line contains ![](https://latex.codecogs.com/svg.image?N).

The second and third lines contain ![](https://latex.codecogs.com/svg.image?f) and ![](https://latex.codecogs.com/svg.image?b), respectively.

The fourth line contains ![](https://latex.codecogs.com/svg.image?Q).

The next ![](https://latex.codecogs.com/svg.image?Q) lines contains a query, with the ![](https://latex.codecogs.com/svg.image?i)-th line containing ![](https://latex.codecogs.com/svg.image?r_i).
<br></br>

**OUTPUT FORMAT (print output to the terminal / stdout):**

![](https://latex.codecogs.com/svg.image?Q) lines, with the ![](https://latex.codecogs.com/svg.image?i)-th line consisting of ![](https://latex.codecogs.com/svg.image?x_i) and (![](https://latex.codecogs.com/svg.image?y_i)'s remainder when divided by ![](https://latex.codecogs.com/svg.image?10^9+7))
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
3 2
3 1
2 1
```

After removing the last card from the first deck, he also needs to remove the second and fourth cards (3 in total). He can remove those three cards, or remove the all of them (2 ways).
