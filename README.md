
# Snake Game

This is a simple **Snake Game** implemented in Java, where you control a snake that moves around the board and tries to eat food. The goal is to grow the snake as long as possible without hitting walls or the snake itself. The game uses the **W**, **A**, **S**, **D** keys for movement, and the board size is customizable within the range of 3 to 10 rows and columns.

## Features

- **Customizable Board Size**: Choose between 3 and 10 rows and columns for the game board.
- **Movement**: Use the **W**, **A**, **S**, **D** keys to move the snake up, left, down, and right.
- **Food Generation**: The game randomly generates food on the board, and the snake grows every time it eats food.
- **Game Over**: The game ends when the snake collides with the wall or itself.

## Installation

To run the Snake game, you need to have **Java** installed on your machine.

### Steps to run the game:
1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/ash-2-code-12/Java-Console---SnakeGame.git
   ```

2. Compile the Java files:
   ```bash
   javac Main.java Snake.java
   ```

3. Run the game:
   ```bash
   java Main
   ```

## How to Play

- Upon starting the game, you will be asked to enter the size of the board (between 3 and 10 rows and columns).
- After that, use the following keys to control the snake:
  - **W** to move Up
  - **A** to move Left
  - **S** to move Down
  - **D** to move Right
- The snake will continue moving until you hit the wall or collide with yourself. The game ends when either of these happens.

## Game Controls

- **W**: Move Up
- **A**: Move Left
- **S**: Move Down
- **D**: Move Right

## Example Output

```
Enter the Row size (min 3, max 10): 
4
Enter the Column size (min 3, max 10): 
4

Current Game Board:
---------------------------
X . 0 .
. . . .
. . . .
. . . .
---------------------------

Enter the Direction (W = Up, S = Down, A = Left, D = Right):
d

Current Game Board:
---------------------------
. X 0 .
. . . .
. . . .
. . . .
---------------------------

Enter the Direction (W = Up, S = Down, A = Left, D = Right):
d

Current Game Board:
---------------------------
. X X .
. . . .
0 . . .
. . . .
---------------------------

Enter the Direction (W = Up, S = Down, A = Left, D = Right):
d

Current Game Board:
---------------------------
. . X X
. . . .
0 . . .
. . . .
---------------------------

Enter the Direction (W = Up, S = Down, A = Left, D = Right):
s

Current Game Board:
---------------------------
. . . X
. . . X
0 . . .
. . . .
---------------------------

Enter the Direction (W = Up, S = Down, A = Left, D = Right):
s

Current Game Board:
---------------------------
. . . .
. . . X
0 . . X
. . . .
---------------------------

Enter the Direction (W = Up, S = Down, A = Left, D = Right):
a

Current Game Board:
---------------------------
. . . .
. . . .
0 . X X
. . . .
---------------------------

Enter the Direction (W = Up, S = Down, A = Left, D = Right):
a

Current Game Board:
---------------------------
. . . .
. . . .
0 X X .
. . . .
---------------------------

Enter the Direction (W = Up, S = Down, A = Left, D = Right):
a

Current Game Board:
---------------------------
. . . .
. . . .
X X X .
. . . .
---------------------------

Enter the Direction (W = Up, S = Down, A = Left, D = Right):
a

Game Over! You hit the wall or yourself.
