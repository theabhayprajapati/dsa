

# if the lenght of $1 is less than 1 then print error in red
if [ ${#1} -lt 1 ]; then
    echo -e "\033[31mError: Please provide a commit message\033[0m"
    exit 1
fi
git add .
git commit -m "$1"
# check for errors
git push
# msg green color msg
echo -e "\e[32m"
echo "Commit and push done :"
echo -e "\e[0m"
# in blue
echo -e "\e[34m"
echo "Now you can go to github.com and see your changes"
echo -e "\e[0m"

