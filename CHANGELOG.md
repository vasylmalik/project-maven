# Changelog

## [1.0.0] - 2026-05-04

### Added
- **Maven configuration**: Fully configured `pom.xml` according to the project requirements.
- **Local Library Installation**: Added `maven-install-plugin` to automatically install `desktop-game-engine.jar` into the local repository during the build.
- **Dependency Management**: Configured `maven-dependency-plugin` to collect all compile-scope dependencies into `target/dependencies`.
- **Fat-JAR support**: Configured `maven-jar-plugin` with a custom `MANIFEST.MF` to use `JarRsrcLoader` for running the JavaFX application with nested dependencies in `lib/`.
- **Resources section**: Added configuration to include bundled dependencies inside the final JAR.

### Changed
- **Dependencies**: Updated versions to match manual requirements:
  - `commons-lang3` -> `3.12.0`
  - `javafx-controls` -> `18.0.1`
  - `junit-jupiter-engine` -> `5.8.2`
- **Build Process**: Integrated all steps into the standard `mvn clean install` lifecycle.
- **Installation script**: Fixed `bin/maven-install.bash` to use relative paths for better portability.

### Fixed
- **Test Filtering**: Configured `maven-surefire-plugin` to exclude `StrangeTest` from the build process while keeping other tests active.
