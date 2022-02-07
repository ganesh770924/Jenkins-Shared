package com.hexaware.sharedlib
public class SharedLibrary{
  def steps
  
  public SharedLibrary(steps,name){
    this.steps=steps
    this.name=name
  }
  
  public void startbuild(){
    steps.echo "Hello World ,${this.name}"
    }
}
