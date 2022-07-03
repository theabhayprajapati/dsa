# take input for msg
echo "Enter the message"
read msg
# run this cmd
git add .
git commit -m "$msg"
git push 
