package com.hexaware.sharedlib
public class SharedLibrary{
  def steps
  
  public SharedLibrary(steps){
    this.steps=steps
  }
  
  public void startbuild(){
     steps.echo "Hello World!"
    }
}
