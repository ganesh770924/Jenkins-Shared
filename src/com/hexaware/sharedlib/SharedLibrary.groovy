package com.hexaware.sharedlib
public class SharedLibrary{
  def steps
  
  public SharedLibrary(steps){
    this.steps=steps
  
  }
  
  public void startbuild(map config=[:]){
    steps.echo "Hello World ,${config.name}"
    }
}
