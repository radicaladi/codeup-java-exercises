-- Starting up MySQL from terminal
    -- mysql.server status // checks if it is running
    -- mysql.server start // starts instance of mysql on local
    -- mysql.server restart // restarts mysql
    -- mysql.server stop // discontinues running of mysql
    -- mysql -u root -p // how you log into mysql BUT must make sure mysql is started first

-- SELECT * FROM mysql.user;
    -- outputs a large list of data that is unreadable
-- SELECT * FROM mysql.user \G
    -- outputs the same large list of data in a much easier to read format
    -- data seems to be 4 rows of permissions statuses

-- SELECT user, host FROM mysql.user;
    -- outputs a list of users and their sql hosts

-- SELECT * FROM mysql.help_topic
    -- outputs an incredible amount of help(?) data; 701 rows
    -- formatted makes it easier to read but still incredibly long

--