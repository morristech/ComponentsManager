package me.vponomarenko.injectionmanager.exeptions

/**
 * Author: Valery Ponomarenko
 * Date: 14/08/2018
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */
 
class ComponentNotFoundException(key: String) : Throwable("Component of the $key type was not found")