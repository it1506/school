<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://codex.wordpress.org/Editing_wp-config.php
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define('DB_NAME', 'wordpress');

/** MySQL database username */
define('DB_USER', 'root');

/** MySQL database password */
define('DB_PASSWORD', '');

/** MySQL hostname */
define('DB_HOST', 'localhost');

/** Database Charset to use in creating database tables. */
define('DB_CHARSET', 'utf8mb4');

/** The Database Collate type. Don't change this if in doubt. */
define('DB_COLLATE', '');

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define('AUTH_KEY',         '/+6ESd.=X<Zg,_tc0g/!1)><0W@,i0DZH=wxxAw_/n;k!s`2vmzm[DP.%^gV*d}O');
define('SECURE_AUTH_KEY',  'r:1c8Qp.&Mev{kXv^EOG>7rxD0ILoMfC){5XT{M^r6uVwmz%>2varfaj8 %CpE:i');
define('LOGGED_IN_KEY',    's_-8}~uz)M6V*qy+s b+X6%P*oBj;$vJvDTx)TD.sx(Bg#8Z`CLoZfel=a:{i&X>');
define('NONCE_KEY',        '/@sh3DKRrin# oa$u-k32)aT/)d^+bC}>RCx3HG!5kQ~BS_]FnT)H;W=w1P` ;k_');
define('AUTH_SALT',        'Et%c:lWGFf#~`R(`/47FmPE1c2*D3{5XZK4&^K87obOfgkTig^dan;zaL,BNNk(U');
define('SECURE_AUTH_SALT', 'sk7$.Q8gY3GtM$f/GU=J(e5Ad$xiU_d0z#Vx|{NUj6l:yFy7 SW# N*NSMrLN|9y');
define('LOGGED_IN_SALT',   'n}FbssZvlRG<36}d+]?;/-C?sI`lrrC5AsGlDjcEHvj]OK`6L33+HEd;G %jL@cL');
define('NONCE_SALT',       'X4[seoZfwp3DX#[ShI[J1Zq]GR_ f<PZFhSZ +bJx@|HRxB(! .q;G8%(LQ^3cLu');

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix  = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the Codex.
 *
 * @link https://codex.wordpress.org/Debugging_in_WordPress
 */
define('WP_DEBUG', false);

/* That's all, stop editing! Happy blogging. */

/** Absolute path to the WordPress directory. */
if ( !defined('ABSPATH') )
	define('ABSPATH', dirname(__FILE__) . '/');

/** Sets up WordPress vars and included files. */
require_once(ABSPATH . 'wp-settings.php');
