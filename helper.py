import os
import re

# Function to add a line at the beginning of each Java file
def add_line_to_java_files(directory, line):
    for filename in os.listdir(directory):
        if filename.endswith(".java"):
            filepath = os.path.join(directory, filename)
            with open(filepath, "r+") as file:
                content = file.read()
                file.seek(0, 0)  # Move the cursor to the beginning of the file
                file.write(line.rstrip('\r\n') + '\n' + content)  # Add the line at the beginning
                file.close()

# Get the current directory where the script resides
current_directory = os.path.dirname(os.path.realpath(__file__))

# Line to add at the beginning of each Java file
line_to_add = "package JavaPrograms;"

# Call the function to add the line to Java files in the directory
add_line_to_java_files(current_directory, line_to_add)
