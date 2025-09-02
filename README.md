# Flight-Infotainment-Clone

## Table of Contents
- [Flight-Infotainment-Clone](#flight-infotainment-clone)
  - [Table of Contents](#table-of-contents)
  - [Description](#description)
  - [Features](#features)
  - [Project Structure](#project-structure)
    - [Class Responsibilities:](#class-responsibilities)
  - [Technologies Used](#technologies-used)
  - [Installation and Execution](#installation-and-execution)
  - [Authors](#authors)

## Description
Flight Infotainment Clone is a Java application that simulates an in-flight entertainment system for airplane passengers. The interface offers several features such as a home screen, flight map, entertainment (movies, music, games, books, news, web browsing), onboard services, billing, and a child mode.

## Features
- **Home**: Welcome screen with a background image.
- **Map**: Displays a flight map.
- **Entertainment**: Access to multiple entertainment categories:
  - Google (simulated web browsing)
  - News
  - Music
  - Movies
  - Games
  - Books
- **Services**: Interface for onboard services (not fully implemented in this version).
- **Billing**: Manages onboard purchases with payment options.
- **Child Mode**: Simplified and child-friendly interface with appropriate content.

## Project Structure
project_IHM/<br>
├── src/<br>
│ └── project_IHM/<br>
│ ├── img/ (directory containing image resources)<br>
│ ├── Accueil.java<br>
│ ├── BackgroundPanel.java<br>
│ ├── Book.java<br>
│ ├── BookChild.java<br>
│ ├── ButtonManager.java<br>
│ ├── CheckBoxRenderer.java<br>
│ ├── Child.java<br>
│ ├── Divertissement.java<br>
│ ├── Facture.java<br>
│ ├── Game.java<br>
│ ├── GameChild.java<br>
│ ├── Google.java<br>
│ ├── Hotesse.java<br>
│ ├── Map.java<br>
│ ├── modepasse.java<br>
│ ├── Movies.java<br>
│ ├── MoviesChild.java<br>
│ ├── Musique.java<br>
│ ├── MusiqueChild.java<br>
│ ├── News.java<br>
│ ├── PanelManager.java<br>
│ ├── Passager.java (main class)<br>
│ └── Service.java<br>
└── README.md<br>

### Class Responsibilities:
- **Passager.java**: Main application entry point, handles UI layout and navigation
- **Accueil.java**: Home screen implementation
- **Map.java**: Flight map display
- **Divertissement.java**: Main entertainment hub
- **Google.java**, **News.java**, **Musique.java**, **Movies.java**, **Game.java**, **Book.java**: Individual entertainment sections
- **Child.java**: Child mode controller
- **MoviesChild.java**, **MusiqueChild.java**, **GameChild.java**, **BookChild.java**: Child-friendly entertainment sections
- **Service.java**: Onboard services interface
- **Facture.java**: Billing and payment system
- **Hotesse.java**: Flight attendant interface
- **ButtonManager.java**: Toggle button state management
- **PanelManager.java**: Panel visibility control
- **BackgroundPanel.java**: Custom background image panel
- **CheckBoxRenderer.java**: Custom checkbox renderer for tables

## Technologies Used
- **Java SE**: Core application development
- **Swing**: GUI framework for building the user interface
- **AWT**: Supporting graphics and layout management
- **Java Sound API**: Audio volume control functionality
- **ImageIO**: Image loading and processing
- **JTable**: Table components for data display
- **JOptionPane**: Dialog boxes for user interaction
- **Timer**: Real-time clock updates

## Installation and Execution
1. Ensure you have Java JDK 8 or higher installed.
2. Clone the repository or download the source files.
3. Compile the Java files:
   ```bash
   javac -d bin src/project_IHM/*.java

## Authors
- Baghdadi Nadjib Aimen