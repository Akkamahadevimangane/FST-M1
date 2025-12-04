# the user to enter their name and their age.
name = input( "What is your name: " )
age = int( input( "How old are you: " ) )
# input age and find when 100 year completes!!Dev
year = str( ( 2024 - age ) + 100 )
print( name + " will be 100 years old in the year " + year )