package com.hexaware.sharedlib
public class SharedLibrary{
  def steps
  
  public SharedLibrary(steps,map config=[:]){
    this.steps=steps
    this.config.name=config.name
  
  }
  
  public void startbuild(){
    steps.echo "Hello World ,${this.config.name}"
    }
}
