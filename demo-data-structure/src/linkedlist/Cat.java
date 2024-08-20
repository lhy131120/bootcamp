package linkedlist;

public class Cat {
  private Eye[] eyes; // stored the Eye object memony location

  // This cat just only two eyes, user can't declear not less or more than two eyes' cat
  public Cat(Color color) {
    this.eyes = new Eye[2];
    this.eyes[0] = new Eye(color);
    this.eyes[1] = new Eye(color);
  }

  public Eye[]getEyes() {
    return this.eyes;
  }

  public Eye getLeftEye() {
    return this.eyes[0]; // two step on this: 1. get eye object and find eye Array Object
  }

  public Eye getrightEye() {
    return this.eyes[1]; // two step on this: 1. get eye object and find eye Array Object
  }

}
