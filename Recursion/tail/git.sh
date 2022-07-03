# if the lenght of $1 is less than 1 then print error in red
if [ ${#1} -lt 1 ]; then
    echo -e "\033[31mError: Please provide a commit message\033[0m"
    exit 1
fi
git add .
git commit -m "$1"
# check for errors
# get the branch name
# print
git push
# msg green color msg
branch_name=$(git rev-parse --abbrev-ref HEAD)
echo -e "\033[32mCommitted and pushed branch: $branch_name\033[0m"
echo -e "\e[34m"
echo "message : $1"
echo -e "\e[0m"

