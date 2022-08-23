import java.util.Scanner;
public class Elevator {
 private int currentFloor = 2;
 private int minFloor = 1;
 private int maxFloor = 1;
 public int floor = 0;

 public Elevator(int minFloor, int maxFloor) {
  this.minFloor = minFloor;
  this.maxFloor = maxFloor;
 }

 public int getCurrentFloor() {
  return currentFloor;
 }

 public void moveApp() {
  currentFloor = currentFloor + 1;
 }

 public void moveDown() {
  currentFloor = currentFloor - 1;
 }

 public void move(int floor) {
  if (floor <= minFloor || floor >= maxFloor) {

   System.out.println("Ошибка");
   return;

  }

   while (true) {

    if (currentFloor < floor) {
     moveApp();
     System.out.println(getCurrentFloor());
    }
    if (currentFloor > floor) {
     moveDown();
     System.out.println(getCurrentFloor());
    }

   }
  }
 }