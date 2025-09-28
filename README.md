# unit-converter-adapter
# Unit Converter Adapter

## Project Overview
This Java project demonstrates the **Adapter Design Pattern** in action.  
It allows converting **Metric units** (meters, kilograms) to **Imperial units** (feet, pounds) and vice versa.  

The purpose of this project is to show how the Adapter pattern **enables incompatible interfaces to work together** without modifying the original classes.

---

## Functionality

The project provides the following functionality:

1. **Convert meters to feet**  
   - Example: `10.0 meters = 32.8084 feet`  
   - Uses the `UnitAdapter` to adapt the `MetricConverter` to the `UnitConverter` interface.  

2. **Convert kilograms to pounds**  
   - Example: `5.0 kg = 11.0231 pounds`  
   - The `UnitAdapter` converts metric mass units to imperial mass units.  

3. **Client-independent conversion**  
   - The `Main` class (client) calls methods on the `UnitConverter` interface.  
   - The client **does not need to know** about `MetricConverter` or `ImperialConverter` classes directly.  

---

## Classes and Their Roles

- **UnitConverter (Interface)**: Defines methods for converting units.  
- **MetricConverter (Adaptee)**: Provides actual metric unit values.  
- **ImperialConverter (Adaptee)**: Provides actual imperial unit values.  
- **UnitAdapter (Adapter)**: Implements `UnitConverter` and translates calls to metric or imperial converters.  
- **Main (Client)**: Demonstrates conversions and prints results to the console.  

---

## How It Works

1. The **client** (`Main`) requests a conversion via the `UnitConverter` interface.  
2. The **adapter** (`UnitAdapter`) translates this request and delegates it to the appropriate converter (`MetricConverter` or `ImperialConverter`).  
3. The **adaptee** performs the actual calculation and returns the converted value.  
4. The **client** receives the result without being aware of the adapter or the internal converters.  

---



