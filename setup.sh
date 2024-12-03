#!/bin/bash

if [[ $# -ne 1 ]]; then
  echo "Make sure you pass the current year: $0 <current_year>"
  exit 1
fi

yearPlaceholder="{YEAR}"
currentYear=$1

# Update the implementation unit tests run config
implementationRunConfigFilePath=".run/Implementation Tests.run.xml"
sed -i '' "s|$yearPlaceholder|$currentYear|g" "$implementationRunConfigFilePath"

# Update the solutions unit tests run config
solutionTestsRunConfigFilePath=".run/Solution Tests.run.xml"
sed -i '' "s|$yearPlaceholder|$currentYear|g" "$solutionTestsRunConfigFilePath"

# Update the solutions run config
solutionsRunConfigFilePath=".run/Run Solutions.run.xml"
sed -i '' "s|$yearPlaceholder|$currentYear|g" "$solutionsRunConfigFilePath"

# Update the root Gradle project name
gradleSettingsFilePath="settings.gradle.kts"
sed -i '' "s|advent-of-code-template|advent-of-code-$currentYear|g" "$gradleSettingsFilePath"