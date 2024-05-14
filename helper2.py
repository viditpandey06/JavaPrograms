import os
import re

# Function to add or remove a line at the beginning of each Java file
def modify_java_files(directory, line, action):
    for filename in os.listdir(directory):
        if filename.endswith(".java"):
            filepath = os.path.join(directory, filename)
            with open(filepath, "r+") as file:
                content = file.read()
                file.seek(0, 0)  # Move the cursor to the beginning of the file
                if action == "add":
                    if not content.startswith(line):
                        file.write(line.rstrip('\r\n') + '\n' + content)  # Add the line at the beginning
                elif action == "remove":
                    content = re.sub(r'^' + re.escape(line.rstrip('\r\n')) + r'\n', '', content, flags=re.MULTILINE)
                    file.write(content)  # Remove the line if found at the beginning
                file.truncate()  # Truncate the file to remove any extra content
                file.close()

# Get the current directory where the script resides
current_directory = os.path.dirname(os.path.realpath(__file__))

# Line to add or remove at the beginning of each Java file
line_to_modify = "package JavaPrograms;"

# Specify whether to add or remove the line
action = "remove"  # Change to "add" to add the line

# Call the function to add or remove the line from Java files in the directory
modify_java_files(current_directory, line_to_modify, action)
